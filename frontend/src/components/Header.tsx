import {Link} from "react-router-dom";

export default function Header() {
    return (
        <header className="bg-blue-500 text-white py-4">
            <div className="container mx-auto flex items-center justify-between px-4">
                <h1 className="text-xl font-semibold">
                    <Link to="/" className="hover:text-gray-200">MyApp</Link>
                    </h1>

                <nav className="space-x-6">
                    <Link to="/" className="hover:text-gray-200">Home</Link>
                    <Link to="/movie" className="hover:text-gray-200">Movies</Link>
                    <Link to="/movie/add" className="hover:text-gray-200">Add Movie</Link>
                    <Link to="/login" className="hover:text-gray-200">Login</Link>
                </nav>
            </div>
        </header>
    );
}
