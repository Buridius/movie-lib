interface MovieCardProps {
    id: string,
    title: string;
    genre: string;
    poster?: string,
    onCardClick: () => void,
    onDelete: () => void,
    onEdit: () => void
}



export default function MovieCard({ title, genre, poster, onCardClick, onDelete, onEdit }: Readonly<MovieCardProps>) {
    return (
        <div className="movie-card" onClick={onCardClick}>
            {poster ? (
                <img src={poster} alt={title} className="movie-poster" />
            ) : (
                <div className="movie-poster placeholder">
                    No Image
                </div>
            )}

            <div className="movie-info">
                <h2>{title}</h2>
                <p>{genre}</p>
            </div>

            <button
                className="delete"
                onClick={(e) => {
                    e.stopPropagation();
                    onDelete();
                }}
            >
                Delete
            </button>
            <button
                className="edit-button"
                onClick={(e) => {
                    e.stopPropagation();
                    onEdit();
                }}
                >
                Edit Movie
            </button>
        </div>
    );
}

